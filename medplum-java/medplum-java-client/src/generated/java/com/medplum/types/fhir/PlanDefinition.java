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
  Optional<Id> id();

  Optional<Reference> subjectReference();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> author();

  Optional<List<PlanDefinition_Goal>> goal();

  Optional<Date> lastReviewDate();

  Optional<List<Canonical>> library();

  Optional<List<ResourceList>> contained();

  Optional<Markdown> copyright();

  Optional<Date> approvalDate();

  Optional<List<PlanDefinition_Action>> action();

  Optional<Boolean> experimental();

  Optional<String> title();

  Optional<List<ContactDetail>> endorser();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> description();

  Optional<String> usage();

  Optional<List<ContactDetail>> editor();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<List<ContactDetail>> contact();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Period> effectivePeriod();

  Optional<String> subtitle();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<UsageContext>> useContext();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<PlandefinitionStatus> status();

  Optional<CodeableConcept> type();

  String resourceType();

  Optional<List<CodeableConcept>> topic();

  Optional<Meta> meta();

  Optional<Uri> url();

  Optional<Markdown> purpose();

  Optional<Code> language();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<String> name();

  static ImmutablePlanDefinition.ResourceTypeBuildStage builder() {
    return ImmutablePlanDefinition.builder();
  }
}
