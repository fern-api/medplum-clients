export declare type Catalogentry_relatedentryRelationtype = Catalogentry_relatedentryRelationtype.Triggers;
export declare const Catalogentry_relatedentryRelationtype: {
    Triggers: Catalogentry_relatedentryRelationtype.Triggers;
    _visit: <Result>(value: Catalogentry_relatedentryRelationtype, visitor: Catalogentry_relatedentryRelationtype._Visitor<Result>) => Result;
};
export declare namespace Catalogentry_relatedentryRelationtype {
    type Triggers = "triggers" & {
        __Triggers: void;
    };
    interface _Visitor<Result> {
        triggers: () => Result;
        _unknown: () => Result;
    }
}
