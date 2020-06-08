"use strict";

var Proveedores = require("../models/proveedores.model");

exports.create = function (req, res) {
  Proveedores.create(req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.get = function (req, res) {
  Proveedores.get({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.getAll = function (req, res) {
  Proveedores.getAll({}, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.update = function (req, res) {
  Proveedores.updateById(req.params.id, req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.delete = function (req, res) {
  Proveedores.removeById({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};
