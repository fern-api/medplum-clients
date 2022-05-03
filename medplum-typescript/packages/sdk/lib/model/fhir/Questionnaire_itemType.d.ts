export declare type Questionnaire_itemType = Questionnaire_itemType.Group | Questionnaire_itemType.Display | Questionnaire_itemType.Boolean | Questionnaire_itemType.Decimal | Questionnaire_itemType.Integer | Questionnaire_itemType.Date | Questionnaire_itemType.DateTime | Questionnaire_itemType.Time | Questionnaire_itemType.String | Questionnaire_itemType.Text | Questionnaire_itemType.Url | Questionnaire_itemType.Choice | Questionnaire_itemType.Attachment | Questionnaire_itemType.Reference | Questionnaire_itemType.Quantity;
export declare const Questionnaire_itemType: {
    Group: Questionnaire_itemType.Group;
    Display: Questionnaire_itemType.Display;
    Boolean: Questionnaire_itemType.Boolean;
    Decimal: Questionnaire_itemType.Decimal;
    Integer: Questionnaire_itemType.Integer;
    Date: Questionnaire_itemType.Date;
    DateTime: Questionnaire_itemType.DateTime;
    Time: Questionnaire_itemType.Time;
    String: Questionnaire_itemType.String;
    Text: Questionnaire_itemType.Text;
    Url: Questionnaire_itemType.Url;
    Choice: Questionnaire_itemType.Choice;
    Attachment: Questionnaire_itemType.Attachment;
    Reference: Questionnaire_itemType.Reference;
    Quantity: Questionnaire_itemType.Quantity;
    _visit: <Result>(value: Questionnaire_itemType, visitor: Questionnaire_itemType._Visitor<Result>) => Result;
};
export declare namespace Questionnaire_itemType {
    type Group = "group" & {
        __Group: void;
    };
    type Display = "display" & {
        __Display: void;
    };
    type Boolean = "boolean" & {
        __Boolean: void;
    };
    type Decimal = "decimal" & {
        __Decimal: void;
    };
    type Integer = "integer" & {
        __Integer: void;
    };
    type Date = "date" & {
        __Date: void;
    };
    type DateTime = "dateTime" & {
        __DateTime: void;
    };
    type Time = "time" & {
        __Time: void;
    };
    type String = "string" & {
        __String: void;
    };
    type Text = "text" & {
        __Text: void;
    };
    type Url = "url" & {
        __Url: void;
    };
    type Choice = "choice" & {
        __Choice: void;
    };
    type Attachment = "attachment" & {
        __Attachment: void;
    };
    type Reference = "reference" & {
        __Reference: void;
    };
    type Quantity = "quantity" & {
        __Quantity: void;
    };
    interface _Visitor<Result> {
        group: () => Result;
        display: () => Result;
        boolean: () => Result;
        decimal: () => Result;
        integer: () => Result;
        date: () => Result;
        dateTime: () => Result;
        time: () => Result;
        string: () => Result;
        text: () => Result;
        url: () => Result;
        choice: () => Result;
        attachment: () => Result;
        reference: () => Result;
        quantity: () => Result;
        _unknown: () => Result;
    }
}
