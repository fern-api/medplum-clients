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
    as = ImmutableExpression.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Expression {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<ExpressionLanguage> language();

  Optional<String> expression();

  Optional<id> name();

  Optional<String> description();

  Optional<uri> reference();

  static ImmutableExpression.Builder builder() {
    return ImmutableExpression.builder();
  }
}
