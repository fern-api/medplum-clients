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
    as = ImmutableMeasure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure {
  Optional<String> title();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> author();

  String resourceType();

  Optional<List<Measure_Group>> group();

  Optional<Markdown> rationale();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Optional<List<UsageContext>> useContext();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<CodeableConcept> compositeScoring();

  Optional<MeasureStatus> status();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<CodeableConcept>> type();

  Optional<String> name();

  Optional<Date> lastReviewDate();

  Optional<String> subtitle();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> rateAggregation();

  Optional<Markdown> copyright();

  Optional<List<Measure_SupplementalData>> supplementalData();

  Optional<String> riskAdjustment();

  Optional<Reference> subjectReference();

  Optional<CodeableConcept> scoring();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> editor();

  Optional<CodeableConcept> improvementNotation();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> usage();

  Optional<Id> id();

  Optional<Uri> url();

  Optional<Markdown> purpose();

  Optional<Boolean> experimental();

  Optional<Markdown> clinicalRecommendationStatement();

  Optional<Markdown> description();

  Optional<List<Canonical>> library();

  Optional<String> publisher();

  Optional<List<Markdown>> definition();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<Date> approvalDate();

  Optional<Markdown> guidance();

  Optional<Markdown> disclaimer();

  Optional<List<ContactDetail>> endorser();

  Optional<String> version();

  static ImmutableMeasure.ResourceTypeBuildStage builder() {
    return ImmutableMeasure.builder();
  }
}
