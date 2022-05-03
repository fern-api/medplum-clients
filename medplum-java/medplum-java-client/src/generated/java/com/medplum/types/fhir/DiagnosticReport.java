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
    as = ImmutableDiagnosticReport.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DiagnosticReport {
  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<String> effectiveDateTime();

  Optional<List<Reference>> performer();

  Optional<List<Reference>> specimen();

  String resourceType();

  Optional<List<Reference>> basedOn();

  Optional<DiagnosticreportStatus> status();

  Optional<String> conclusion();

  Optional<List<CodeableConcept>> conclusionCode();

  Optional<List<CodeableConcept>> category();

  Optional<Reference> encounter();

  Optional<List<Reference>> resultsInterpreter();

  Optional<Meta> meta();

  CodeableConcept code();

  Optional<Reference> subject();

  Optional<Instant> issued();

  Optional<List<Reference>> imagingStudy();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> result();

  Optional<List<DiagnosticReport_Media>> media();

  Optional<List<Extension>> extension();

  Optional<List<Attachment>> presentedForm();

  Optional<Uri> implicitRules();

  Optional<Period> effectivePeriod();

  Optional<Code> language();

  static ImmutableDiagnosticReport.ResourceTypeBuildStage builder() {
    return ImmutableDiagnosticReport.builder();
  }
}
