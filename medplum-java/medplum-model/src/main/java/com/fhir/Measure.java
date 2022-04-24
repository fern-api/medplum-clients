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
    as = ImmutableMeasure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure {
  Optional<markdown> clinicalRecommendationStatement();

  Optional<String> rateAggregation();

  Optional<Meta> meta();

  Optional<String> title();

  Optional<String> usage();

  Optional<String> subtitle();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Measure_SupplementalData>> supplementalData();

  Optional<CodeableConcept> scoring();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> improvementNotation();

  Optional<Reference> subjectReference();

  Optional<code> language();

  Optional<List<ContactDetail>> author();

  Optional<markdown> guidance();

  Optional<dateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<markdown> copyright();

  Optional<List<ContactDetail>> editor();

  Optional<String> publisher();

  Optional<List<Identifier>> identifier();

  Optional<date> lastReviewDate();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> topic();

  Optional<markdown> purpose();

  Optional<id> id();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Narrative> text();

  Optional<markdown> description();

  Optional<markdown> rationale();

  Optional<List<ResourceList>> contained();

  Optional<String> riskAdjustment();

  Optional<String> version();

  Optional<CodeableConcept> compositeScoring();

  Optional<List<CodeableConcept>> type();

  Optional<Period> effectivePeriod();

  Optional<date> approvalDate();

  Optional<List<markdown>> definition();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> name();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Boolean> experimental();

  Optional<uri> url();

  Optional<List<Measure_Group>> group();

  Optional<MeasureStatus> status();

  Optional<List<canonical>> library();

  Optional<markdown> disclaimer();

  static ImmutableMeasure.ResourceTypeBuildStage builder() {
    return ImmutableMeasure.builder();
  }
}
