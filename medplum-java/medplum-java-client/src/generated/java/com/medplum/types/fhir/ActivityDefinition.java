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
  Optional<Markdown> description();

  Optional<List<Dosage>> dosage();

  Optional<Uri> url();

  Optional<List<ContactDetail>> author();

  Optional<Duration> timingDuration();

  Optional<Reference> productReference();

  Optional<List<ActivityDefinition_DynamicValue>> dynamicValue();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Date> lastReviewDate();

  Optional<Quantity> quantity();

  Optional<List<Reference>> observationRequirement();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> observationResultRequirement();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> location();

  Optional<String> publisher();

  Optional<Boolean> experimental();

  Optional<Uri> implicitRules();

  Optional<Reference> subjectReference();

  Optional<Canonical> profile();

  Optional<Code> priority();

  Optional<Timing> timingTiming();

  Optional<Age> timingAge();

  Optional<Code> language();

  Optional<CodeableConcept> code();

  Optional<String> version();

  Optional<List<CodeableConcept>> bodySite();

  Optional<Boolean> doNotPerform();

  Optional<ActivitydefinitionStatus> status();

  Optional<List<ContactDetail>> editor();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<ContactDetail>> endorser();

  Optional<List<ActivityDefinition_Participant>> participant();

  Optional<String> timingDateTime();

  Optional<Id> id();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Date> approvalDate();

  Optional<String> usage();

  Optional<Code> kind();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Extension>> extension();

  Optional<String> subtitle();

  String resourceType();

  Optional<String> title();

  Optional<Code> intent();

  Optional<Narrative> text();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<Period> timingPeriod();

  Optional<List<Reference>> specimenRequirement();

  Optional<String> name();

  Optional<Markdown> purpose();

  Optional<List<CodeableConcept>> topic();

  Optional<List<UsageContext>> useContext();

  Optional<List<Canonical>> library();

  Optional<Range> timingRange();

  Optional<Canonical> transform();

  Optional<Meta> meta();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<Period> effectivePeriod();

  Optional<List<ResourceList>> contained();

  static ImmutableActivityDefinition.ResourceTypeBuildStage builder() {
    return ImmutableActivityDefinition.builder();
  }
}
