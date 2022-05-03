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
  Optional<Id> requestId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<Testscript_operationMethod> method();

  Optional<String> url();

  Optional<String> id();

  Optional<Coding> type();

  Optional<List<Extension>> extension();

  Optional<String> label();

  Optional<Id> responseId();

  Optional<List<TestScript_RequestHeader>> requestHeader();

  Optional<Integer> origin();

  Optional<String> params();

  Optional<Id> targetId();

  Optional<Code> resource();

  Optional<Boolean> encodeRequestUrl();

  Optional<Integer> destination();

  Optional<Code> contentType();

  Optional<Code> accept();

  Optional<Id> sourceId();

  static ImmutableTestScript_Operation.Builder builder() {
    return ImmutableTestScript_Operation.builder();
  }
}
