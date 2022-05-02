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
  Optional<Code> language();

  Optional<List<Measure_SupplementalData>> supplementalData();

  Optional<Markdown> disclaimer();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> purpose();

  Optional<Markdown> rationale();

  Optional<List<Markdown>> definition();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> topic();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> type();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> contact();

  Optional<String> usage();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> riskAdjustment();

  Optional<Markdown> copyright();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<Markdown> guidance();

  Optional<Boolean> experimental();

  String resourceType();

  Optional<CodeableConcept> improvementNotation();

  Optional<Date> approvalDate();

  Optional<CodeableConcept> compositeScoring();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Measure_Group>> group();

  Optional<List<ContactDetail>> author();

  Optional<Id> id();

  Optional<Markdown> description();

  Optional<Uri> url();

  Optional<String> publisher();

  Optional<Reference> subjectReference();

  Optional<List<Canonical>> library();

  Optional<DateTime> date();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> scoring();

  Optional<Date> lastReviewDate();

  Optional<List<ContactDetail>> editor();

  Optional<MeasureStatus> status();

  Optional<String> subtitle();

  Optional<Markdown> clinicalRecommendationStatement();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<ResourceList>> contained();

  Optional<String> title();

  Optional<String> rateAggregation();

  Optional<List<ContactDetail>> endorser();

  static ImmutableMeasure.ResourceTypeBuildStage builder() {
    return ImmutableMeasure.builder();
  }
}
