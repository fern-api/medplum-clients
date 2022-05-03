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
    as = ImmutableTestReport_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Operation {
  Optional<Markdown> message();

  Optional<Uri> detail();

  Optional<String> id();

  Optional<Testreport_operationResult> result();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestReport_Operation.Builder builder() {
    return ImmutableTestReport_Operation.builder();
  }
}
