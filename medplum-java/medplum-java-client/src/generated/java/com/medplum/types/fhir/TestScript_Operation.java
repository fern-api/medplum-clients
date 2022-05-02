package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> label();

  Optional<String> url();

  Optional<Coding> type();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<Testscript_operationMethod> method();

  Optional<Code> resource();

  Optional<List<Extension>> extension();

  Optional<String> params();

  Optional<Id> responseId();

  Optional<Code> accept();

  Optional<Integer> origin();

  Optional<List<TestScript_RequestHeader>> requestHeader();

  Optional<String> id();

  Optional<Integer> destination();

  Optional<Boolean> encodeRequestUrl();

  Optional<Code> contentType();

  Optional<Id> targetId();

  Optional<Id> requestId();

  Optional<Id> sourceId();

  static ImmutableTestScript_Operation.Builder builder() {
    return ImmutableTestScript_Operation.builder();
  }
}
