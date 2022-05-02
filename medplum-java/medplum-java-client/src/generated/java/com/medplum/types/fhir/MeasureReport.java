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
  Optional<MeasurereportType> type();

  Optional<Reference> reporter();

  Optional<List<ResourceList>> contained();

  Optional<MeasurereportStatus> status();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<Meta> meta();

  Optional<List<Reference>> evaluatedResource();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> improvementNotation();

  Optional<Code> language();

  Canonical measure();

  Optional<List<MeasureReport_Group>> group();

  Optional<Reference> subject();

  Optional<List<Identifier>> identifier();

  Period period();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  static ImmutableMeasureReport.ResourceTypeBuildStage builder() {
    return ImmutableMeasureReport.builder();
  }
}
