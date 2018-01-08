'use strict';

exports.deleteFlexSubscriptionById = function(args, res, next) {
  /**
   * delete Flex subscription by id
   * Flex subscriptions could be configured.
   *
   * id Long 
   * no response value expected for this operation
   **/
  res.end();
}

exports.deletePrivateFlexSubscriptionByName = function(args, res, next) {
  /**
   * delete private Flex subscription by name
   * Flex subscriptions could be configured.
   *
   * name String 
   * no response value expected for this operation
   **/
  res.end();
}

exports.deletePublicFlexSubscriptionByName = function(args, res, next) {
  /**
   * delete public (owned) or private Flex subscription by name
   * Flex subscriptions could be configured.
   *
   * name String 
   * no response value expected for this operation
   **/
  res.end();
}

exports.getFlexSubscriptionById = function(args, res, next) {
  /**
   * retrieve Flex subscription by id
   * Flex subscriptions could be configured.
   *
   * id Long 
   * returns FlexSubscriptionResponse
   **/
  var examples = {};
  examples['application/json'] = {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.getPrivateFlexSubscriptionByName = function(args, res, next) {
  /**
   * retrieve a private Flex subscription by name
   * Flex subscriptions could be configured.
   *
   * name String 
   * returns FlexSubscriptionResponse
   **/
  var examples = {};
  examples['application/json'] = {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.getPrivateFlexSubscriptions = function(args, res, next) {
  /**
   * retrieve private Flex subscriptions
   * Flex subscriptions could be configured.
   *
   * returns List
   **/
  var examples = {};
  examples['application/json'] = [ {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
} ];
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.getPublicFlexSubscriptionByName = function(args, res, next) {
  /**
   * retrieve a public or private (owned) Flex subscription by name
   * Flex subscriptions could be configured.
   *
   * name String 
   * returns FlexSubscriptionResponse
   **/
  var examples = {};
  examples['application/json'] = {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.getPublicFlexSubscriptions = function(args, res, next) {
  /**
   * retrieve public and private (owned) Flex subscriptions
   * Flex subscriptions could be configured.
   *
   * returns List
   **/
  var examples = {};
  examples['application/json'] = [ {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
} ];
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.postPrivateFlexSubscription = function(args, res, next) {
  /**
   * create Flex subscription as private resource
   * Flex subscriptions could be configured.
   *
   * body FlexSubscriptionRequest  (optional)
   * returns FlexSubscriptionResponse
   **/
  var examples = {};
  examples['application/json'] = {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.postPublicFlexSubscription = function(args, res, next) {
  /**
   * create Flex subscription as public resource
   * Flex subscriptions could be configured.
   *
   * body FlexSubscriptionRequest  (optional)
   * returns FlexSubscriptionResponse
   **/
  var examples = {};
  examples['application/json'] = {
  "owner" : "aeiou",
  "default" : false,
  "publicInAccount" : false,
  "smartSenseSubscriptionId" : 0,
  "usedForController" : false,
  "name" : "aeiou",
  "smartSenseSubscription" : {
    "owner" : "aeiou",
    "publicInAccount" : false,
    "id" : 1,
    "autoGenerated" : false,
    "subscriptionId" : "aeiou",
    "account" : "aeiou"
  },
  "id" : 6,
  "subscriptionId" : "aeiou",
  "account" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.putDefaultFlexSubscriptionById = function(args, res, next) {
  /**
   * sets the account default flag on the Flex subscription
   * Flex subscriptions could be configured.
   *
   * id Long 
   * no response value expected for this operation
   **/
  res.end();
}

exports.putPublicDefaultFlexSubscriptionByName = function(args, res, next) {
  /**
   * sets the account default flag on the Flex subscription
   * Flex subscriptions could be configured.
   *
   * name String 
   * no response value expected for this operation
   **/
  res.end();
}

exports.putPublicUsedForControllerFlexSubscriptionByName = function(args, res, next) {
  /**
   * sets the account 'used for controller' flag on the Flex subscription
   * Flex subscriptions could be configured.
   *
   * name String 
   * no response value expected for this operation
   **/
  res.end();
}

exports.putUsedForControllerFlexSubscriptionById = function(args, res, next) {
  /**
   * sets the account 'used for controller' flag on the Flex subscription
   * Flex subscriptions could be configured.
   *
   * id Long 
   * no response value expected for this operation
   **/
  res.end();
}

