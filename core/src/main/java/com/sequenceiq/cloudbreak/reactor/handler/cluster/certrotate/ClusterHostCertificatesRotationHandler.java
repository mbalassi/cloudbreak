package com.sequenceiq.cloudbreak.reactor.handler.cluster.certrotate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sequenceiq.cloudbreak.common.event.Selectable;
import com.sequenceiq.cloudbreak.reactor.api.event.cluster.certrotate.ClusterCertificatesRotationFailed;
import com.sequenceiq.cloudbreak.reactor.api.event.cluster.certrotate.ClusterHostCertificatesRotationRequest;
import com.sequenceiq.cloudbreak.reactor.api.event.cluster.certrotate.ClusterHostCertificatesRotationSuccess;
import com.sequenceiq.flow.event.EventSelectorUtil;
import com.sequenceiq.flow.reactor.api.handler.ExceptionCatcherEventHandler;

@Component
public class ClusterHostCertificatesRotationHandler extends ExceptionCatcherEventHandler<ClusterHostCertificatesRotationRequest> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClusterHostCertificatesRotationHandler.class);

    @Override
    public String selector() {
        return EventSelectorUtil.selector(ClusterHostCertificatesRotationRequest.class);
    }

    @Override
    protected Selectable defaultFailureEvent(Long resourceId, Exception e) {
        return new ClusterCertificatesRotationFailed(resourceId, e);
    }

    @Override
    protected Selectable doAccept(HandlerEvent event) {
        LOGGER.debug("!!!ClusterHostCertificatesRotationHandler.doAccept()!!!");
        return new ClusterHostCertificatesRotationSuccess(event.getData().getResourceId());
    }
}
