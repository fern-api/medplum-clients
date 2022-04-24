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
    as = ImmutablePlanDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition {
  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> reviewer();

  Optional<CodeableConcept> type();

  Optional<List<canonical>> library();

  Optional<String> version();

  Optional<List<ContactDetail>> editor();

  Optional<List<ContactDetail>> author();

  String resourceType();

  Optional<List<PlanDefinition_Action>> action();

  Optional<Reference> subjectReference();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Identifier>> identifier();

  Optional<String> usage();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<dateTime> date();

  Optional<date> lastReviewDate();

  Optional<PlandefinitionStatus> status();

  Optional<code> language();

  Optional<List<UsageContext>> useContext();

  Optional<markdown> description();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<String> title();

  Optional<uri> url();

  Optional<date> approvalDate();

  Optional<markdown> purpose();

  Optional<List<Extension>> modifierExtension();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> subtitle();

  Optional<uri> implicitRules();

  Optional<List<CodeableConcept>> topic();

  Optional<Meta> meta();

  Optional<markdown> copyright();

  Optional<id> id();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> endorser();

  Optional<String> name();

  Optional<String> publisher();

  Optional<Boolean> experimental();

  Optional<List<Extension>> extension();

  Optional<List<PlanDefinition_Goal>> goal();

  static ImmutablePlanDefinition.ResourceTypeBuildStage builder() {
    return ImmutablePlanDefinition.builder();
  }
}
