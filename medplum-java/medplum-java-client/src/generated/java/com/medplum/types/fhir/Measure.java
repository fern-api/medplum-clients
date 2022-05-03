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
  Optional<Id> id();

  Optional<String> title();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> improvementNotation();

  Optional<CodeableConcept> scoring();

  Optional<String> riskAdjustment();

  Optional<List<Measure_SupplementalData>> supplementalData();

  Optional<List<ContactDetail>> editor();

  Optional<String> name();

  Optional<MeasureStatus> status();

  Optional<Markdown> guidance();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Markdown> description();

  Optional<Date> approvalDate();

  Optional<String> subtitle();

  Optional<List<CodeableConcept>> topic();

  Optional<Markdown> clinicalRecommendationStatement();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> usage();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> endorser();

  Optional<CodeableConcept> compositeScoring();

  Optional<Narrative> text();

  Optional<List<Markdown>> definition();

  Optional<Date> lastReviewDate();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  String resourceType();

  Optional<Reference> subjectReference();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> type();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> library();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<Markdown> rationale();

  Optional<List<ContactDetail>> author();

  Optional<String> rateAggregation();

  Optional<Markdown> purpose();

  Optional<Markdown> disclaimer();

  Optional<Uri> url();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<ContactDetail>> contact();

  Optional<String> publisher();

  Optional<String> version();

  Optional<List<Measure_Group>> group();

  Optional<Markdown> copyright();

  static ImmutableMeasure.ResourceTypeBuildStage builder() {
    return ImmutableMeasure.builder();
  }
}
