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
  Optional<String> effectiveDateTime();

  Optional<List<Reference>> basedOn();

  Optional<Instant> issued();

  String resourceType();

  Optional<DiagnosticreportStatus> status();

  Optional<List<Reference>> result();

  Optional<List<Reference>> performer();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<Attachment>> presentedForm();

  CodeableConcept code();

  Optional<Id> id();

  Optional<List<Reference>> specimen();

  Optional<List<ResourceList>> contained();

  Optional<String> conclusion();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Reference> subject();

  Optional<Narrative> text();

  Optional<Reference> encounter();

  Optional<List<DiagnosticReport_Media>> media();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> resultsInterpreter();

  Optional<List<Reference>> imagingStudy();

  Optional<List<CodeableConcept>> conclusionCode();

  static ImmutableDiagnosticReport.ResourceTypeBuildStage builder() {
    return ImmutableDiagnosticReport.builder();
  }
}
