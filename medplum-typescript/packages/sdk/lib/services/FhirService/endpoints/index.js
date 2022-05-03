"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.updateResource = exports.search = exports.readVersion = exports.readResourceHistory = exports.readResource = exports.deleteResource = exports.createResource = void 0;
exports.createResource = __importStar(require("./createResource"));
exports.deleteResource = __importStar(require("./deleteResource"));
exports.readResource = __importStar(require("./readResource"));
exports.readResourceHistory = __importStar(require("./readResourceHistory"));
exports.readVersion = __importStar(require("./readVersion"));
exports.search = __importStar(require("./search"));
exports.updateResource = __importStar(require("./updateResource"));
//# sourceMappingURL=index.js.map