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
  Optional<Narrative> text();

  Optional<Code> priority();

  Optional<List<ResourceList>> contained();

  Optional<List<Canonical>> library();

  Optional<List<Dosage>> dosage();

  Optional<List<ContactDetail>> author();

  Optional<Range> timingRange();

  Optional<List<Extension>> extension();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> contact();

  String resourceType();

  Optional<Canonical> transform();

  Optional<Code> language();

  Optional<Reference> subjectReference();

  Optional<Timing> timingTiming();

  Optional<String> version();

  Optional<String> timingDateTime();

  Optional<Id> id();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<String> usage();

  Optional<Period> timingPeriod();

  Optional<Reference> location();

  Optional<Uri> url();

  Optional<String> subtitle();

  Optional<List<ContactDetail>> editor();

  Optional<Date> lastReviewDate();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Code> kind();

  Optional<Markdown> purpose();

  Optional<DateTime> date();

  Optional<CodeableConcept> code();

  Optional<Meta> meta();

  Optional<Duration> timingDuration();

  Optional<Markdown> copyright();

  Optional<Canonical> profile();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> specimenRequirement();

  Optional<String> title();

  Optional<List<ActivityDefinition_Participant>> participant();

  Optional<ActivitydefinitionStatus> status();

  Optional<Code> intent();

  Optional<Quantity> quantity();

  Optional<Period> effectivePeriod();

  Optional<String> name();

  Optional<List<UsageContext>> useContext();

  Optional<List<Reference>> observationRequirement();

  Optional<List<ActivityDefinition_DynamicValue>> dynamicValue();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Reference>> observationResultRequirement();

  Optional<Markdown> description();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> publisher();

  Optional<Reference> productReference();

  Optional<List<CodeableConcept>> bodySite();

  Optional<Boolean> experimental();

  Optional<Uri> implicitRules();

  Optional<Boolean> doNotPerform();

  Optional<Age> timingAge();

  static ImmutableActivityDefinition.ResourceTypeBuildStage builder() {
    return ImmutableActivityDefinition.builder();
  }
}
