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
  Optional<Code> language();

  Optional<DateTime> date();

  Optional<ActivitydefinitionStatus> status();

  Optional<String> title();

  Optional<Boolean> doNotPerform();

  Optional<CodeableConcept> code();

  String resourceType();

  Optional<Narrative> text();

  Optional<String> version();

  Optional<Age> timingAge();

  Optional<List<Reference>> observationResultRequirement();

  Optional<Markdown> purpose();

  Optional<List<ActivityDefinition_Participant>> participant();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Dosage>> dosage();

  Optional<List<UsageContext>> useContext();

  Optional<Range> timingRange();

  Optional<List<ActivityDefinition_DynamicValue>> dynamicValue();

  Optional<List<CodeableConcept>> topic();

  Optional<Boolean> experimental();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> bodySite();

  Optional<Meta> meta();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Markdown> copyright();

  Optional<Period> effectivePeriod();

  Optional<List<Identifier>> identifier();

  Optional<Duration> timingDuration();

  Optional<Reference> productReference();

  Optional<List<ResourceList>> contained();

  Optional<Code> kind();

  Optional<Uri> url();

  Optional<List<ContactDetail>> author();

  Optional<Reference> location();

  Optional<Timing> timingTiming();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<Reference> subjectReference();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<String> usage();

  Optional<Date> lastReviewDate();

  Optional<String> publisher();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Period> timingPeriod();

  Optional<List<Reference>> specimenRequirement();

  Optional<List<ContactDetail>> editor();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> description();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> endorser();

  Optional<Code> priority();

  Optional<List<Canonical>> library();

  Optional<String> subtitle();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<String> timingDateTime();

  Optional<Canonical> transform();

  Optional<Code> intent();

  Optional<Canonical> profile();

  Optional<List<Reference>> observationRequirement();

  static ImmutableActivityDefinition.ResourceTypeBuildStage builder() {
    return ImmutableActivityDefinition.builder();
  }
}
