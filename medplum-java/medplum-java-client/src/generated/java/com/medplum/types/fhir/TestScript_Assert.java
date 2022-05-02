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
  Optional<Code> resource();

  Optional<String> requestURL();

  Optional<String> responseCode();

  Optional<Id> validateProfileId();

  Optional<String> value();

  Optional<Boolean> navigationLinks();

  Optional<List<Extension>> extension();

  Optional<String> path();

  Optional<List<Extension>> modifierExtension();

  Optional<Testscript_assertOperator> operator();

  Optional<Code> contentType();

  Optional<String> label();

  Optional<Boolean> warningOnly();

  Optional<String> id();

  Optional<String> compareToSourceExpression();

  Optional<String> headerField();

  Optional<Id> sourceId();

  Optional<Testscript_assertRequestmethod> requestMethod();

  Optional<Testscript_assertResponse> response();

  Optional<String> expression();

  Optional<String> compareToSourcePath();

  Optional<String> compareToSourceId();

  Optional<String> description();

  Optional<Testscript_assertDirection> direction();

  Optional<String> minimumId();

  static ImmutableTestScript_Assert.Builder builder() {
    return ImmutableTestScript_Assert.builder();
  }
}
