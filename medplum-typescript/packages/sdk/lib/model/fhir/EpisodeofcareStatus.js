"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EpisodeofcareStatus = void 0;
exports.EpisodeofcareStatus = {
    Planned: "planned",
    Waitlist: "waitlist",
    Active: "active",
    Onhold: "onhold",
    Finished: "finished",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EpisodeofcareStatus.Planned:
                return visitor.planned();
            case exports.EpisodeofcareStatus.Waitlist:
                return visitor.waitlist();
            case exports.EpisodeofcareStatus.Active:
                return visitor.active();
            case exports.EpisodeofcareStatus.Onhold:
                return visitor.onhold();
            case exports.EpisodeofcareStatus.Finished:
                return visitor.finished();
            case exports.EpisodeofcareStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EpisodeofcareStatus.js.map