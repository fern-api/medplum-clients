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
  Optional<List<Reference>> result();

  Optional<Uri> implicitRules();

  Optional<Instant> issued();

  Optional<List<Reference>> resultsInterpreter();

  CodeableConcept code();

  Optional<Reference> encounter();

  Optional<List<Attachment>> presentedForm();

  Optional<String> conclusion();

  Optional<List<CodeableConcept>> conclusionCode();

  Optional<DiagnosticreportStatus> status();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<String> effectiveDateTime();

  Optional<Reference> subject();

  Optional<List<Reference>> specimen();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> basedOn();

  Optional<Period> effectivePeriod();

  Optional<List<Reference>> performer();

  Optional<List<Reference>> imagingStudy();

  Optional<List<DiagnosticReport_Media>> media();

  static ImmutableDiagnosticReport.CodeBuildStage builder() {
    return ImmutableDiagnosticReport.builder();
  }
}
