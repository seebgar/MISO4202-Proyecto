const CfsmController = require("../controllers/cfsm.controller");
const route = require("../config/middleware");

module.exports = function (router) {
  router.post("/cfsm", route.protected, CfsmController.create);
  router.get("/cfsm", route.protected, CfsmController.getAll);
  router.get("/cfsm/:id", route.protected, CfsmController.get);
  router.put("/cfsm/:id", route.protected, CfsmController.update);
  router.delete("/cfsm/:id", route.protected, CfsmController.delete);
};
