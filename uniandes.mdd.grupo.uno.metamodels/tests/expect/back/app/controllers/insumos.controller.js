"use strict";

var Insumos = require("../models/insumos.model");

exports.create = function (req, res) {
  Insumos.create(req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.get = function (req, res) {
  Insumos.get({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.getAll = function (req, res) {
  Insumos.getAll({}, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.update = function (req, res) {
  Insumos.updateById(req.params.id, req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.delete = function (req, res) {
  Insumos.removeById({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};
