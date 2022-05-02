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
  Optional<Uri> url();

  Optional<String> subtitle();

  Optional<String> publisher();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> editor();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Date> lastReviewDate();

  Optional<String> name();

  Optional<Date> approvalDate();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<UsageContext>> useContext();

  Optional<List<PlanDefinition_Goal>> goal();

  Optional<String> version();

  Optional<CodeableConcept> type();

  Optional<PlandefinitionStatus> status();

  Optional<String> title();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<Markdown> copyright();

  Optional<String> usage();

  Optional<Boolean> experimental();

  Optional<Reference> subjectReference();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<ContactDetail>> reviewer();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Canonical>> library();

  Optional<List<PlanDefinition_Action>> action();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> topic();

  static ImmutablePlanDefinition.ResourceTypeBuildStage builder() {
    return ImmutablePlanDefinition.builder();
  }
}
