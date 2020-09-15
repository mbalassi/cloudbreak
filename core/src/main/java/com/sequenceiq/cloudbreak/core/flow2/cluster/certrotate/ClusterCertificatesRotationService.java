package com.sequenceiq.cloudbreak.core.flow2.cluster.certrotate;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sequenceiq.cloudbreak.core.flow2.cluster.provision.ClusterCreationService;
import com.sequenceiq.cloudbreak.core.flow2.stack.CloudbreakFlowMessageService;
import com.sequenceiq.cloudbreak.domain.view.StackView;
import com.sequenceiq.cloudbreak.service.StackUpdater;
import com.sequenceiq.cloudbreak.service.cluster.ClusterService;

@Service
public class ClusterCertificatesRotationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClusterCreationService.class);

    @Inject
    private StackUpdater stackUpdater;

    @Inject
    private CloudbreakFlowMessageService flowMessageService;

    @Inject
    private ClusterService clusterService;

    void initClusterCertificatesRotation(long stackId) {
//        String statusReason = "Rotating the certificates of the cluster.";
//        LOGGER.debug(statusReason);
//        stackUpdater.updateStackStatus(stackId, DetailedStackStatus.CLUSTER_OPERATION, statusReason);
//        clusterService.updateClusterStatusByStackId(stackId, UPDATE_IN_PROGRESS);
//        flowMessageService.fireEventAndLog(stackId, UPDATE_IN_PROGRESS.name(), ResourceEvent.CLUSTER_CERTIFICATE_REISSUE);
    }

    void hostCertificatesRotationStarted(long stackId) {
//        String statusReason = "The redeployment of the reissued certificate to the cluster has been started.";
//        LOGGER.debug(statusReason);
//        stackUpdater.updateStackStatus(stackId, DetailedStackStatus.CLUSTER_OPERATION, statusReason);
//        clusterService.updateClusterStatusByStackId(stackId, UPDATE_IN_PROGRESS);
//        flowMessageService.fireEventAndLog(stackId, UPDATE_IN_PROGRESS.name(), ResourceEvent.CLUSTER_CERTIFICATE_REDEPLOY);
    }

    void certificatesRotationFinished(long stackId) {
//        clusterService.updateClusterStatusByStackId(stackId, AVAILABLE);
//        stackUpdater.updateStackStatus(stackId, DetailedStackStatus.AVAILABLE, "Renewal of the cluster's certificate finished.");
//        flowMessageService.fireEventAndLog(stackId, AVAILABLE.name(), ResourceEvent.CLUSTER_CERTIFICATE_RENEWAL_FINISHED);
    }

    void certificatesRotationFailed(StackView stackView, Exception exception) {
//        if (stackView.getClusterView() != null) {
//            Long stackId = stackView.getId();
//            String errorMessage = getErrorMessageFromException(exception);
//            clusterService.updateClusterStatusByStackId(stackId, UPDATE_FAILED, errorMessage);
//            stackUpdater.updateStackStatus(stackId, DetailedStackStatus.AVAILABLE);
//            flowMessageService.fireEventAndLog(stackId, UPDATE_FAILED.name(), ResourceEvent.CLUSTER_CERTIFICATE_RENEWAL_FAILED, errorMessage);
//        } else {
//            LOGGER.info("Cluster was null. Flow action was not required.");
//        }
    }

    private String getErrorMessageFromException(Exception exception) {
        return null;
//        boolean transactionRuntimeException = exception instanceof TransactionService.TransactionRuntimeExecutionException;
//        if (transactionRuntimeException && exception.getCause() != null && exception.getCause().getCause() != null) {
//            return exception.getCause().getCause().getMessage();
//        } else {
//            return exception instanceof CloudbreakException && exception.getCause() != null
//                    ? exception.getCause().getMessage() : exception.getMessage();
//        }
    }
}
