"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Questionnaire_itemType = void 0;
exports.Questionnaire_itemType = {
    Group: "group",
    Display: "display",
    Boolean: "boolean",
    Decimal: "decimal",
    Integer: "integer",
    Date: "date",
    DateTime: "dateTime",
    Time: "time",
    String: "string",
    Text: "text",
    Url: "url",
    Choice: "choice",
    Attachment: "attachment",
    Reference: "reference",
    Quantity: "quantity",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Questionnaire_itemType.Group:
                return visitor.group();
            case exports.Questionnaire_itemType.Display:
                return visitor.display();
            case exports.Questionnaire_itemType.Boolean:
                return visitor.boolean();
            case exports.Questionnaire_itemType.Decimal:
                return visitor.decimal();
            case exports.Questionnaire_itemType.Integer:
                return visitor.integer();
            case exports.Questionnaire_itemType.Date:
                return visitor.date();
            case exports.Questionnaire_itemType.DateTime:
                return visitor.dateTime();
            case exports.Questionnaire_itemType.Time:
                return visitor.time();
            case exports.Questionnaire_itemType.String:
                return visitor.string();
            case exports.Questionnaire_itemType.Text:
                return visitor.text();
            case exports.Questionnaire_itemType.Url:
                return visitor.url();
            case exports.Questionnaire_itemType.Choice:
                return visitor.choice();
            case exports.Questionnaire_itemType.Attachment:
                return visitor.attachment();
            case exports.Questionnaire_itemType.Reference:
                return visitor.reference();
            case exports.Questionnaire_itemType.Quantity:
                return visitor.quantity();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Questionnaire_itemType.js.map