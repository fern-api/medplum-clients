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
  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<Code> resource();

  Optional<String> responseCode();

  Optional<String> id();

  Optional<String> path();

  Optional<String> compareToSourceExpression();

  Optional<String> compareToSourcePath();

  Optional<Testscript_assertRequestmethod> requestMethod();

  Optional<String> requestURL();

  Optional<Boolean> navigationLinks();

  Optional<Boolean> warningOnly();

  Optional<Code> contentType();

  Optional<Testscript_assertDirection> direction();

  Optional<Testscript_assertOperator> operator();

  Optional<Id> sourceId();

  Optional<Testscript_assertResponse> response();

  Optional<String> label();

  Optional<String> expression();

  Optional<String> value();

  Optional<List<Extension>> modifierExtension();

  Optional<String> compareToSourceId();

  Optional<String> headerField();

  Optional<Id> validateProfileId();

  Optional<String> minimumId();

  static ImmutableTestScript_Assert.Builder builder() {
    return ImmutableTestScript_Assert.builder();
  }
}
