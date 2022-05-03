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
    as = ImmutableOperationOutcome_Issue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationOutcome_Issue {
  Optional<CodeableConcept> details();

  Optional<Operationoutcome_issueSeverity> severity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> expression();

  Optional<String> diagnostics();

  Optional<List<Extension>> extension();

  Optional<List<String>> location();

  Optional<Operationoutcome_issueCode> code();

  Optional<String> id();

  static ImmutableOperationOutcome_Issue.Builder builder() {
    return ImmutableOperationOutcome_Issue.builder();
  }
}
