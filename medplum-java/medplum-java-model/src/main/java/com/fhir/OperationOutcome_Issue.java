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
    as = ImmutableOperationOutcome_Issue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationOutcome_Issue {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Operationoutcome_issueSeverity> severity();

  Optional<CodeableConcept> details();

  Optional<Operationoutcome_issueCode> code();

  Optional<String> diagnostics();

  Optional<List<Extension>> extension();

  Optional<List<String>> expression();

  Optional<List<String>> location();

  static ImmutableOperationOutcome_Issue.Builder builder() {
    return ImmutableOperationOutcome_Issue.builder();
  }
}
