"use strict";

var Cfsm = require("../models/cfsm.model");

exports.create = function (req, res) {
  Cfsm.create(req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.get = function (req, res) {
  Cfsm.get({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.getAll = function (req, res) {
  Cfsm.getAll({}, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.update = function (req, res) {
  Cfsm.updateById(req.params.id, req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.delete = function (req, res) {
  Cfsm.removeById({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};
