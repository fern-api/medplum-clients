export declare type Claimresponse_processnoteType = Claimresponse_processnoteType.Display | Claimresponse_processnoteType.Print | Claimresponse_processnoteType.Printoper;
export declare const Claimresponse_processnoteType: {
    Display: Claimresponse_processnoteType.Display;
    Print: Claimresponse_processnoteType.Print;
    Printoper: Claimresponse_processnoteType.Printoper;
    _visit: <Result>(value: Claimresponse_processnoteType, visitor: Claimresponse_processnoteType._Visitor<Result>) => Result;
};
export declare namespace Claimresponse_processnoteType {
    type Display = "display" & {
        __Display: void;
    };
    type Print = "print" & {
        __Print: void;
    };
    type Printoper = "printoper" & {
        __Printoper: void;
    };
    interface _Visitor<Result> {
        display: () => Result;
        print: () => Result;
        printoper: () => Result;
        _unknown: () => Result;
    }
}
