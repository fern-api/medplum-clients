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
    as = ImmutableDiagnosticReport.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DiagnosticReport {
  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<DiagnosticreportStatus> status();

  Optional<List<Attachment>> presentedForm();

  Optional<List<CodeableConcept>> category();

  Optional<instant> issued();

  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<List<Reference>> specimen();

  Optional<Reference> subject();

  Optional<List<Reference>> basedOn();

  Optional<uri> implicitRules();

  Optional<List<Reference>> performer();

  Optional<String> conclusion();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> conclusionCode();

  Optional<List<Reference>> resultsInterpreter();

  Optional<List<DiagnosticReport_Media>> media();

  Optional<List<Reference>> result();

  Optional<Reference> encounter();

  Optional<id> id();

  Optional<Period> effectivePeriod();

  Optional<String> effectiveDateTime();

  Optional<List<Reference>> imagingStudy();

  static ImmutableDiagnosticReport.ResourceTypeBuildStage builder() {
    return ImmutableDiagnosticReport.builder();
  }
}
