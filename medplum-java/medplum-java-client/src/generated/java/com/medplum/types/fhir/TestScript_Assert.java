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
  Optional<String> expression();

  Optional<Boolean> navigationLinks();

  Optional<String> minimumId();

  Optional<String> id();

  Optional<Code> contentType();

  Optional<Id> validateProfileId();

  Optional<String> requestURL();

  Optional<List<Extension>> modifierExtension();

  Optional<String> label();

  Optional<String> compareToSourceId();

  Optional<Testscript_assertResponse> response();

  Optional<String> value();

  Optional<Testscript_assertDirection> direction();

  Optional<String> description();

  Optional<String> responseCode();

  Optional<String> compareToSourcePath();

  Optional<Boolean> warningOnly();

  Optional<List<Extension>> extension();

  Optional<Testscript_assertOperator> operator();

  Optional<String> path();

  Optional<Id> sourceId();

  Optional<Testscript_assertRequestmethod> requestMethod();

  Optional<String> compareToSourceExpression();

  Optional<String> headerField();

  Optional<Code> resource();

  static ImmutableTestScript_Assert.Builder builder() {
    return ImmutableTestScript_Assert.builder();
  }
}
