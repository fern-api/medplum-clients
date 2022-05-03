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
    as = ImmutablePlanDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition {
  Optional<List<Canonical>> library();

  Optional<List<PlanDefinition_Action>> action();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Period> effectivePeriod();

  Optional<String> usage();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> subtitle();

  Optional<Uri> url();

  Optional<Markdown> purpose();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> endorser();

  Optional<DateTime> date();

  Optional<String> name();

  Optional<List<UsageContext>> useContext();

  Optional<PlandefinitionStatus> status();

  Optional<Date> lastReviewDate();

  Optional<Date> approvalDate();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Reference> subjectReference();

  Optional<List<ContactDetail>> contact();

  Optional<String> publisher();

  Optional<Id> id();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> author();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> editor();

  String resourceType();

  Optional<String> title();

  Optional<List<PlanDefinition_Goal>> goal();

  static ImmutablePlanDefinition.ResourceTypeBuildStage builder() {
    return ImmutablePlanDefinition.builder();
  }
}
