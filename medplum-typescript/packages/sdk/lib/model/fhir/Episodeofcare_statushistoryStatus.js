"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Episodeofcare_statushistoryStatus = void 0;
exports.Episodeofcare_statushistoryStatus = {
    Planned: "planned",
    Waitlist: "waitlist",
    Active: "active",
    Onhold: "onhold",
    Finished: "finished",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Episodeofcare_statushistoryStatus.Planned:
                return visitor.planned();
            case exports.Episodeofcare_statushistoryStatus.Waitlist:
                return visitor.waitlist();
            case exports.Episodeofcare_statushistoryStatus.Active:
                return visitor.active();
            case exports.Episodeofcare_statushistoryStatus.Onhold:
                return visitor.onhold();
            case exports.Episodeofcare_statushistoryStatus.Finished:
                return visitor.finished();
            case exports.Episodeofcare_statushistoryStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Episodeofcare_statushistoryStatus.js.map