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
  String resourceType();

  Optional<List<Extension>> extension();

  Canonical measure();

  Optional<List<ResourceList>> contained();

  Optional<Reference> reporter();

  Optional<MeasurereportStatus> status();

  Period period();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<MeasurereportType> type();

  Optional<List<Reference>> evaluatedResource();

  Optional<Narrative> text();

  Optional<CodeableConcept> improvementNotation();

  Optional<DateTime> date();

  Optional<Uri> implicitRules();

  Optional<Reference> subject();

  Optional<List<Identifier>> identifier();

  Optional<List<MeasureReport_Group>> group();

  static ImmutableMeasureReport.ResourceTypeBuildStage builder() {
    return ImmutableMeasureReport.builder();
  }
}
