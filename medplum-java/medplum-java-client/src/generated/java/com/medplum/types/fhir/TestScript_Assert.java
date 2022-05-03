package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Assert.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Assert {
  Optional<Testscript_assertRequestmethod> requestMethod();

  Optional<Code> contentType();

  Optional<Id> validateProfileId();

  Optional<Code> resource();

  Optional<String> value();

  Optional<String> compareToSourcePath();

  Optional<Boolean> navigationLinks();

  Optional<Testscript_assertOperator> operator();

  Optional<Id> sourceId();

  Optional<Testscript_assertDirection> direction();

  Optional<String> requestURL();

  Optional<String> responseCode();

  Optional<String> path();

  Optional<String> label();

  Optional<String> description();

  Optional<String> compareToSourceExpression();

  Optional<Boolean> warningOnly();

  Optional<String> headerField();

  Optional<String> minimumId();

  Optional<String> id();

  Optional<Testscript_assertResponse> response();

  Optional<String> compareToSourceId();

  Optional<String> expression();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Assert.Builder builder() {
    return ImmutableTestScript_Assert.builder();
  }
}
