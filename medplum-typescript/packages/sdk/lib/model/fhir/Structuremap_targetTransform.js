"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_targetTransform = void 0;
exports.Structuremap_targetTransform = {
    Create: "create",
    Copy: "copy",
    Truncate: "truncate",
    Escape: "escape",
    Cast: "cast",
    Append: "append",
    Translate: "translate",
    Reference: "reference",
    DateOp: "dateOp",
    Uuid: "uuid",
    Pointer: "pointer",
    Evaluate: "evaluate",
    Cc: "cc",
    C: "c",
    Qty: "qty",
    Id: "id",
    Cp: "cp",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_targetTransform.Create:
                return visitor.create();
            case exports.Structuremap_targetTransform.Copy:
                return visitor.copy();
            case exports.Structuremap_targetTransform.Truncate:
                return visitor.truncate();
            case exports.Structuremap_targetTransform.Escape:
                return visitor.escape();
            case exports.Structuremap_targetTransform.Cast:
                return visitor.cast();
            case exports.Structuremap_targetTransform.Append:
                return visitor.append();
            case exports.Structuremap_targetTransform.Translate:
                return visitor.translate();
            case exports.Structuremap_targetTransform.Reference:
                return visitor.reference();
            case exports.Structuremap_targetTransform.DateOp:
                return visitor.dateOp();
            case exports.Structuremap_targetTransform.Uuid:
                return visitor.uuid();
            case exports.Structuremap_targetTransform.Pointer:
                return visitor.pointer();
            case exports.Structuremap_targetTransform.Evaluate:
                return visitor.evaluate();
            case exports.Structuremap_targetTransform.Cc:
                return visitor.cc();
            case exports.Structuremap_targetTransform.C:
                return visitor.c();
            case exports.Structuremap_targetTransform.Qty:
                return visitor.qty();
            case exports.Structuremap_targetTransform.Id:
                return visitor.id();
            case exports.Structuremap_targetTransform.Cp:
                return visitor.cp();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_targetTransform.js.map