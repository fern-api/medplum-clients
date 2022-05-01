export type Catalogentry_relatedentryRelationtype =
    Catalogentry_relatedentryRelationtype.Triggers;

export const Catalogentry_relatedentryRelationtype = {
    Triggers: "triggers" as Catalogentry_relatedentryRelationtype.Triggers,

    _visit: <Result>(
        value: Catalogentry_relatedentryRelationtype,
        visitor: Catalogentry_relatedentryRelationtype._Visitor<Result>
    ): Result => {
        switch (value) {
            case Catalogentry_relatedentryRelationtype.Triggers:
                return visitor.triggers();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Catalogentry_relatedentryRelationtype {
    export type Triggers = "triggers" & {
        __Triggers: void;
    };

    export interface _Visitor<Result> {
        triggers: () => Result;
        _unknown: () => Result;
    }
}
