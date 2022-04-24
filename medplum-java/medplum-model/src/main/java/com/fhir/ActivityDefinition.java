package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableActivityDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ActivityDefinition {
  Optional<code> priority();

  Optional<Boolean> experimental();

  Optional<code> language();

  Optional<CodeableConcept> code();

  Optional<String> title();

  Optional<List<canonical>> library();

  Optional<String> publisher();

  Optional<uri> url();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<Reference> productReference();

  Optional<markdown> purpose();

  Optional<canonical> transform();

  Optional<date> lastReviewDate();

  Optional<String> subtitle();

  Optional<List<ContactDetail>> editor();

  Optional<List<UsageContext>> useContext();

  Optional<code> kind();

  Optional<Period> effectivePeriod();

  Optional<List<Dosage>> dosage();

  Optional<String> version();

  Optional<List<ContactDetail>> author();

  Optional<Duration> timingDuration();

  Optional<markdown> copyright();

  Optional<markdown> description();

  Optional<ActivitydefinitionStatus> status();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Reference>> observationRequirement();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<String> timingDateTime();

  Optional<Period> timingPeriod();

  Optional<date> approvalDate();

  Optional<List<Reference>> specimenRequirement();

  Optional<List<ResourceList>> contained();

  Optional<dateTime> date();

  Optional<List<CodeableConcept>> topic();

  Optional<Boolean> doNotPerform();

  Optional<code> intent();

  Optional<Age> timingAge();

  Optional<Reference> location();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Narrative> text();

  Optional<Timing> timingTiming();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<String> usage();

  Optional<Reference> subjectReference();

  Optional<Range> timingRange();

  String resourceType();

  Optional<List<CodeableConcept>> bodySite();

  Optional<canonical> profile();

  Optional<List<Identifier>> identifier();

  Optional<Quantity> quantity();

  Optional<List<ActivityDefinition_DynamicValue>> dynamicValue();

  Optional<uri> implicitRules();

  Optional<List<ActivityDefinition_Participant>> participant();

  Optional<id> id();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Reference>> observationResultRequirement();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Extension>> extension();

  static ImmutableActivityDefinition.ResourceTypeBuildStage builder() {
    return ImmutableActivityDefinition.builder();
  }
}
