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
  Optional<Markdown> description();

  String resourceType();

  Optional<Date> lastReviewDate();

  Optional<List<ContactDetail>> author();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<Canonical>> library();

  Optional<String> usage();

  Optional<List<CodeableConcept>> topic();

  Optional<String> title();

  Optional<Markdown> purpose();

  Optional<Period> effectivePeriod();

  Optional<Boolean> experimental();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> endorser();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> editor();

  Optional<CodeableConcept> type();

  Optional<List<UsageContext>> useContext();

  Optional<PlandefinitionStatus> status();

  Optional<Id> id();

  Optional<Reference> subjectReference();

  Optional<String> version();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<List<PlanDefinition_Action>> action();

  Optional<List<PlanDefinition_Goal>> goal();

  Optional<String> publisher();

  Optional<List<ContactDetail>> contact();

  Optional<Uri> url();

  Optional<String> subtitle();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Extension>> extension();

  static ImmutablePlanDefinition.ResourceTypeBuildStage builder() {
    return ImmutablePlanDefinition.builder();
  }
}
