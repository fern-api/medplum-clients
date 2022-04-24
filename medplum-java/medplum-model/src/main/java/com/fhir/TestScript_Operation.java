package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Operation {
  Optional<Coding> type();

  Optional<Boolean> encodeRequestUrl();

  Optional<Testscript_operationMethod> method();

  Optional<String> label();

  Optional<String> params();

  Optional<id> targetId();

  Optional<Integer> origin();

  Optional<String> url();

  Optional<List<Extension>> extension();

  Optional<id> sourceId();

  Optional<id> requestId();

  Optional<code> resource();

  Optional<code> accept();

  Optional<String> description();

  Optional<String> id();

  Optional<code> contentType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<TestScript_RequestHeader>> requestHeader();

  Optional<Integer> destination();

  Optional<id> responseId();

  static ImmutableTestScript_Operation.Builder builder() {
    return ImmutableTestScript_Operation.builder();
  }
}
