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
  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Instant> issued();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> specimen();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> imagingStudy();

  Optional<String> conclusion();

  Optional<List<Identifier>> identifier();

  Optional<DiagnosticreportStatus> status();

  Optional<List<Attachment>> presentedForm();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<DiagnosticReport_Media>> media();

  CodeableConcept code();

  Optional<Reference> subject();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> conclusionCode();

  Optional<Reference> encounter();

  Optional<List<Reference>> resultsInterpreter();

  Optional<List<Reference>> result();

  Optional<List<Reference>> performer();

  Optional<Id> id();

  Optional<String> effectiveDateTime();

  static ImmutableDiagnosticReport.ResourceTypeBuildStage builder() {
    return ImmutableDiagnosticReport.builder();
  }
}
