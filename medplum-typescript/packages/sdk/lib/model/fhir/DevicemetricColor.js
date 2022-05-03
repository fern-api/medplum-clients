"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DevicemetricColor = void 0;
exports.DevicemetricColor = {
    Black: "black",
    Red: "red",
    Green: "green",
    Yellow: "yellow",
    Blue: "blue",
    Magenta: "magenta",
    Cyan: "cyan",
    White: "white",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DevicemetricColor.Black:
                return visitor.black();
            case exports.DevicemetricColor.Red:
                return visitor.red();
            case exports.DevicemetricColor.Green:
                return visitor.green();
            case exports.DevicemetricColor.Yellow:
                return visitor.yellow();
            case exports.DevicemetricColor.Blue:
                return visitor.blue();
            case exports.DevicemetricColor.Magenta:
                return visitor.magenta();
            case exports.DevicemetricColor.Cyan:
                return visitor.cyan();
            case exports.DevicemetricColor.White:
                return visitor.white();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DevicemetricColor.js.map