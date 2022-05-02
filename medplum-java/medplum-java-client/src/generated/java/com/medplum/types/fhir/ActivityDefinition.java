package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<ContactDetail>> author();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> editor();

  Optional<Reference> subjectReference();

  Optional<List<ActivityDefinition_DynamicValue>> dynamicValue();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<List<Canonical>> library();

  Optional<List<ContactDetail>> endorser();

  Optional<Code> priority();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Identifier>> identifier();

  Optional<Date> approvalDate();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<Markdown> copyright();

  Optional<String> title();

  Optional<List<CodeableConcept>> topic();

  Optional<CodeableConcept> code();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> reviewer();

  Optional<Reference> location();

  Optional<Narrative> text();

  Optional<String> timingDateTime();

  Optional<String> usage();

  Optional<Markdown> purpose();

  Optional<Uri> url();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Canonical> profile();

  Optional<ActivitydefinitionStatus> status();

  Optional<Boolean> experimental();

  Optional<List<Reference>> specimenRequirement();

  Optional<Age> timingAge();

  Optional<DateTime> date();

  Optional<Period> effectivePeriod();

  Optional<Code> kind();

  Optional<Boolean> doNotPerform();

  Optional<Period> timingPeriod();

  Optional<List<Reference>> observationRequirement();

  Optional<Date> lastReviewDate();

  Optional<Duration> timingDuration();

  Optional<Code> intent();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Markdown> description();

  Optional<String> publisher();

  Optional<Reference> productReference();

  Optional<String> subtitle();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Timing> timingTiming();

  Optional<List<ActivityDefinition_Participant>> participant();

  Optional<List<Reference>> observationResultRequirement();

  Optional<Range> timingRange();

  Optional<Code> language();

  Optional<List<ContactDetail>> contact();

  Optional<List<Dosage>> dosage();

  Optional<Canonical> transform();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Quantity> quantity();

  static ImmutableActivityDefinition.ResourceTypeBuildStage builder() {
    return ImmutableActivityDefinition.builder();
  }
}
