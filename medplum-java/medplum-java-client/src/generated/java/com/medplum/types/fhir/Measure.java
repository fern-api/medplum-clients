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
  Optional<List<CodeableConcept>> type();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> subtitle();

  Optional<List<ResourceList>> contained();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> topic();

  Optional<Reference> subjectReference();

  Optional<List<ContactDetail>> author();

  Optional<Meta> meta();

  Optional<CodeableConcept> improvementNotation();

  Optional<String> title();

  Optional<CodeableConcept> compositeScoring();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> riskAdjustment();

  Optional<Markdown> copyright();

  Optional<Markdown> purpose();

  Optional<CodeableConcept> scoring();

  Optional<List<Measure_SupplementalData>> supplementalData();

  Optional<Markdown> rationale();

  Optional<Markdown> disclaimer();

  Optional<Markdown> description();

  Optional<Boolean> experimental();

  Optional<List<Canonical>> library();

  Optional<List<Extension>> extension();

  Optional<Date> lastReviewDate();

  Optional<List<UsageContext>> useContext();

  Optional<List<Measure_Group>> group();

  Optional<String> publisher();

  Optional<String> version();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> editor();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> rateAggregation();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> usage();

  String resourceType();

  Optional<Markdown> clinicalRecommendationStatement();

  Optional<Uri> url();

  Optional<DateTime> date();

  Optional<MeasureStatus> status();

  Optional<Markdown> guidance();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<List<Markdown>> definition();

  Optional<List<ContactDetail>> endorser();

  Optional<Uri> implicitRules();

  static ImmutableMeasure.ResourceTypeBuildStage builder() {
    return ImmutableMeasure.builder();
  }
}
