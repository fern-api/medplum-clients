package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> compareToSourcePath();

  Optional<code> contentType();

  Optional<String> headerField();

  Optional<Testscript_assertDirection> direction();

  Optional<Boolean> warningOnly();

  Optional<String> label();

  Optional<String> minimumId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> compareToSourceId();

  Optional<id> sourceId();

  Optional<String> description();

  Optional<String> path();

  Optional<code> resource();

  Optional<id> validateProfileId();

  Optional<String> compareToSourceExpression();

  Optional<String> responseCode();

  Optional<Testscript_assertResponse> response();

  Optional<String> value();

  Optional<String> id();

  Optional<Testscript_assertOperator> operator();

  Optional<String> expression();

  Optional<Testscript_assertRequestmethod> requestMethod();

  Optional<Boolean> navigationLinks();

  Optional<List<Extension>> extension();

  Optional<String> requestURL();

  static ImmutableTestScript_Assert.Builder builder() {
    return ImmutableTestScript_Assert.builder();
  }
}
