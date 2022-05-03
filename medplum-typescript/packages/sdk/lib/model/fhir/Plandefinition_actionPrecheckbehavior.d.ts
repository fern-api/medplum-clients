export declare type Plandefinition_actionPrecheckbehavior = Plandefinition_actionPrecheckbehavior.Yes | Plandefinition_actionPrecheckbehavior.No;
export declare const Plandefinition_actionPrecheckbehavior: {
    Yes: Plandefinition_actionPrecheckbehavior.Yes;
    No: Plandefinition_actionPrecheckbehavior.No;
    _visit: <Result>(value: Plandefinition_actionPrecheckbehavior, visitor: Plandefinition_actionPrecheckbehavior._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_actionPrecheckbehavior {
    type Yes = "yes" & {
        __Yes: void;
    };
    type No = "no" & {
        __No: void;
    };
    interface _Visitor<Result> {
        yes: () => Result;
        no: () => Result;
        _unknown: () => Result;
    }
}
