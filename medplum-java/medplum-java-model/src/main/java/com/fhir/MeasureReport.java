package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMeasureReport.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport {
  Optional<dateTime> date();

  Optional<List<MeasureReport_Group>> group();

  Optional<List<Reference>> evaluatedResource();

  Optional<MeasurereportType> type();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<MeasurereportStatus> status();

  Optional<id> id();

  Optional<Reference> reporter();

  canonical measure();

  Optional<code> language();

  Optional<CodeableConcept> improvementNotation();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<uri> implicitRules();

  Period period();

  Optional<Reference> subject();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMeasureReport.MeasureBuildStage builder() {
    return ImmutableMeasureReport.builder();
  }
}
