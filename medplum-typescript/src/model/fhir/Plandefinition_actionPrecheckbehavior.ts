export type Plandefinition_actionPrecheckbehavior =
    | Plandefinition_actionPrecheckbehavior.Yes
    | Plandefinition_actionPrecheckbehavior.No;

export const Plandefinition_actionPrecheckbehavior = {
    Yes: "yes" as Plandefinition_actionPrecheckbehavior.Yes,
    No: "no" as Plandefinition_actionPrecheckbehavior.No,

    _visit: <Result>(
        value: Plandefinition_actionPrecheckbehavior,
        visitor: Plandefinition_actionPrecheckbehavior._Visitor<Result>
    ): Result => {
        switch (value) {
            case Plandefinition_actionPrecheckbehavior.Yes:
                return visitor.yes();
            case Plandefinition_actionPrecheckbehavior.No:
                return visitor.no();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_actionPrecheckbehavior {
    export type Yes = "yes" & {
        __Yes: void;
    };
    export type No = "no" & {
        __No: void;
    };

    export interface _Visitor<Result> {
        yes: () => Result;
        no: () => Result;
        _unknown: () => Result;
    }
}
