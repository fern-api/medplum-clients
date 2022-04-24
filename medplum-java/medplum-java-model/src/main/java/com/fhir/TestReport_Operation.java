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
    as = ImmutableTestReport_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Operation {
  Optional<String> id();

  Optional<uri> detail();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> message();

  Optional<Testreport_operationResult> result();

  static ImmutableTestReport_Operation.Builder builder() {
    return ImmutableTestReport_Operation.builder();
  }
}
