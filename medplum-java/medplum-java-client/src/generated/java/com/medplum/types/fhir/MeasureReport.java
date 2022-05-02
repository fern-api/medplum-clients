package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<MeasureReport_Group>> group();

  Optional<MeasurereportStatus> status();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Reference> reporter();

  Optional<List<Reference>> evaluatedResource();

  Optional<Meta> meta();

  Optional<CodeableConcept> improvementNotation();

  Optional<Narrative> text();

  Optional<MeasurereportType> type();

  Canonical measure();

  String resourceType();

  Optional<Code> language();

  Period period();

  Optional<List<Extension>> extension();

  Optional<Reference> subject();

  static ImmutableMeasureReport.MeasureBuildStage builder() {
    return ImmutableMeasureReport.builder();
  }
}
